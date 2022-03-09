#### Android studio 使用Gradle配置，构建不同维度的产品flavor

##### 1.资源合并与优先级

1.main
2.minApi23
3.minApi23Pay
4.minApi23PayDebug

4>3>2>1  

合并策略,将相同路径中文件进行合并。 生成的apk包会包含1~4目录中所有文件和。


##### 2.productFlavors与 defaultConfig 依赖关系

productFlavors 包含 defaultConfig中所有配置。defaultConfig是productFlavors的子集。
defaultConfig中存放所有变体通用配置。productFlavors变体中同名配置会覆盖defaultConfig中配置。
buildType中配置和productFlavors中配置会进行合并。

比方说 buildType和 productFlavors中均配置了ApplicaiotnId前缀，那么生成的apk包名会包含两种Appllication
```java
buildTypes {
   debug{
        applicationIdSuffix ".debug"
     }
}

productFlavors {
    free {
    dimension "version"
    applicationIdSuffix ".free"
    versionNameSuffix "-demo"
    }
}

:assembleFreeDebug   

```

生成apk包名。  xxx.xxx.xxx.free.debug

##### 3.Gradle 创建的 build 变体数量 等于每个维度的变种数量与buildType 数量的乘积，维度越多组合方式越多，变体数量越多

##### 4.过滤变体Task

```java
variantFilter { variant ->
    def names = variant.flavors*.name
    // To check for a certain build type, use variant.buildType.name == "<buildType>"
    if (names.contains("minApi21") ) {
    // Gradle ignores any variants that satisfy the conditions above.
    setIgnore(true)
    println "$names"
   
}
```

##### 5.源集配置

起始路径从src/开始，切换成功后会识别成java folder 样式，背景变色
```java
sourceSets {
    minApi23PayDebug {
        java.srcDirs = ['src/minApi23PayDebug/other1']
    }
}
```
##### 6.变体文件夹中清单文件包名要写成全路径，在动态改变applicationId 的 applicationIdSuffix时候。不写全路径会报
类notfound异常。


##### 7.app 与 库中维度相同，但是app中变体多于库中变体。即app中变体库中不存在。matchingFallbacks = [库中变体，库中变体]策略




