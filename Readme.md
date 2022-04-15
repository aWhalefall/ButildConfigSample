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



##### 8. module 传递依赖。 app ->lib2->core

 场景. core中的维度在app中不存在。使用google官方策略三

库依赖项包含您的应用不包含的变种维度。

例如，库依赖项包含“libcore”维度的变种，但您的应用仅包含“minApi”维度的变种。
因此，当您要构建“freeDebug”版本的应用时，插件不知道是使用“minApi23Debug”还是“minApi18Debug”版本的依赖项。

请注意，如果您的应用包含库依赖项不包含的变种维度，这不会引发问题。
这是因为，插件只会匹配依赖项中存在的维度的变种。例如，如果依赖项不包含 ABI 的维度，“freeX86Debug”版本的应用将直接使用“freeDebug”版本的依赖项。


需要在app module 下设置维度  missingDimensionStrategy("维度","变体1","变体2").

```java
defaultConfig {
    applicationId "com.kuaidao.butildconfigsample"
    minSdk 24
    targetSdk 31
    versionCode 1
    versionName "1.0"
    testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    missingDimensionStrategy('Api', 'minApi21', 'minApi24')
    missingDimensionStrategy('libcore', 'freeCore', 'paidCore')
}
```

这样app就会有两个missingDimensionStrategy，分别针对lib2 ，和 libCore



总结：个人理解 三种场景分别对应buildType,flavor,dimens 设置strategy
