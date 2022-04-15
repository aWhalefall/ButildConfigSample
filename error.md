```java
Could not determine the dependencies of task ':app:compileHongkongDebugJavaWithJavac'.
> Could not resolve all task dependencies for configuration ':app:hongkongDebugCompileClasspath'.
   > Could not resolve project :shopwindow.
     Required by:
         project :app
      > No matching variant of project :shopwindow was found. The consumer was configured to find an API of a component, preferably optimized for Android, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but:
          - Variant 'chinaBetaApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaBetaRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaBetaApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaBetaRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaDebugApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaDebugRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaReleaseApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaReleaseRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
   > Could not resolve project :home.
     Required by:
         project :app
      > No matching variant of project :home was found. The consumer was configured to find an API of a component, preferably optimized for Android, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but:
          - Variant 'chinaBetaApiElements' capability 2.3.17Trunk:home:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaBetaRuntimeElements' capability 2.3.17Trunk:home:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugApiElements' capability 2.3.17Trunk:home:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugRuntimeElements' capability 2.3.17Trunk:home:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseApiElements' capability 2.3.17Trunk:home:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseRuntimeElements' capability 2.3.17Trunk:home:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaApiElements' capability 2.3.17Trunk:home:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaRuntimeElements' capability 2.3.17Trunk:home:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugApiElements' capability 2.3.17Trunk:home:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugRuntimeElements' capability 2.3.17Trunk:home:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseApiElements' capability 2.3.17Trunk:home:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseRuntimeElements' capability 2.3.17Trunk:home:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
   > Could not resolve project :message.
     Required by:
         project :app
      > No matching variant of project :message was found. The consumer was configured to find an API of a component, preferably optimized for Android, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but:
          - Variant 'chinaBetaApiElements' capability 2.3.17Trunk:message:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaBetaRuntimeElements' capability 2.3.17Trunk:message:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugApiElements' capability 2.3.17Trunk:message:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugRuntimeElements' capability 2.3.17Trunk:message:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseApiElements' capability 2.3.17Trunk:message:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseRuntimeElements' capability 2.3.17Trunk:message:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaApiElements' capability 2.3.17Trunk:message:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaRuntimeElements' capability 2.3.17Trunk:message:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugApiElements' capability 2.3.17Trunk:message:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugRuntimeElements' capability 2.3.17Trunk:message:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseApiElements' capability 2.3.17Trunk:message:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseRuntimeElements' capability 2.3.17Trunk:message:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
   > Could not resolve project :usercenter.
     Required by:
         project :app
      > No matching variant of project :usercenter was found. The consumer was configured to find an API of a component, preferably optimized for Android, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but:
          - Variant 'chinaBetaApiElements' capability 2.3.17Trunk:usercenter:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaBetaRuntimeElements' capability 2.3.17Trunk:usercenter:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugApiElements' capability 2.3.17Trunk:usercenter:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugRuntimeElements' capability 2.3.17Trunk:usercenter:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseApiElements' capability 2.3.17Trunk:usercenter:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseRuntimeElements' capability 2.3.17Trunk:usercenter:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaApiElements' capability 2.3.17Trunk:usercenter:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaRuntimeElements' capability 2.3.17Trunk:usercenter:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugApiElements' capability 2.3.17Trunk:usercenter:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugRuntimeElements' capability 2.3.17Trunk:usercenter:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseApiElements' capability 2.3.17Trunk:usercenter:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseRuntimeElements' capability 2.3.17Trunk:usercenter:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
   > Could not resolve project :loginandreg.
     Required by:
         project :app
      > No matching variant of project :loginandreg was found. The consumer was configured to find an API of a component, preferably optimized for Android, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but:
          - Variant 'chinaBetaApiElements' capability 2.3.17Trunk:loginandreg:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaBetaRuntimeElements' capability 2.3.17Trunk:loginandreg:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugApiElements' capability 2.3.17Trunk:loginandreg:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugRuntimeElements' capability 2.3.17Trunk:loginandreg:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseApiElements' capability 2.3.17Trunk:loginandreg:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseRuntimeElements' capability 2.3.17Trunk:loginandreg:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaApiElements' capability 2.3.17Trunk:loginandreg:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaRuntimeElements' capability 2.3.17Trunk:loginandreg:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugApiElements' capability 2.3.17Trunk:loginandreg:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugRuntimeElements' capability 2.3.17Trunk:loginandreg:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseApiElements' capability 2.3.17Trunk:loginandreg:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseRuntimeElements' capability 2.3.17Trunk:loginandreg:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaBetaApiElements' capability 2.3.17Trunk:loginandreg:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaBetaRuntimeElements' capability 2.3.17Trunk:loginandreg:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaDebugApiElements' capability 2.3.17Trunk:loginandreg:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaDebugRuntimeElements' capability 2.3.17Trunk:loginandreg:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaReleaseApiElements' capability 2.3.17Trunk:loginandreg:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'southEastAsiaReleaseRuntimeElements' capability 2.3.17Trunk:loginandreg:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
   > Could not resolve project :diy.
     Required by:
         project :app
      > No matching variant of project :diy was found. The consumer was configured to find an API of a component, preferably optimized for Android, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but:
          - Variant 'chinaBetaApiElements' capability 2.3.17Trunk:diy:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaBetaRuntimeElements' capability 2.3.17Trunk:diy:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugApiElements' capability 2.3.17Trunk:diy:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugRuntimeElements' capability 2.3.17Trunk:diy:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseApiElements' capability 2.3.17Trunk:diy:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseRuntimeElements' capability 2.3.17Trunk:diy:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaApiElements' capability 2.3.17Trunk:diy:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaRuntimeElements' capability 2.3.17Trunk:diy:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugApiElements' capability 2.3.17Trunk:diy:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugRuntimeElements' capability 2.3.17Trunk:diy:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseApiElements' capability 2.3.17Trunk:diy:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseRuntimeElements' capability 2.3.17Trunk:diy:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
   > Could not resolve project :detail.
     Required by:
         project :app
      > No matching variant of project :detail was found. The consumer was configured to find an API of a component, preferably optimized for Android, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but:
          - Variant 'chinaBetaApiElements' capability 2.3.17Trunk:detail:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaBetaRuntimeElements' capability 2.3.17Trunk:detail:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugApiElements' capability 2.3.17Trunk:detail:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaDebugRuntimeElements' capability 2.3.17Trunk:detail:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseApiElements' capability 2.3.17Trunk:detail:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'chinaReleaseRuntimeElements' capability 2.3.17Trunk:detail:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaApiElements' capability 2.3.17Trunk:detail:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaBetaRuntimeElements' capability 2.3.17Trunk:detail:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugApiElements' capability 2.3.17Trunk:detail:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaDebugRuntimeElements' capability 2.3.17Trunk:detail:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseApiElements' capability 2.3.17Trunk:detail:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)
          - Variant 'overseaReleaseRuntimeElements' capability 2.3.17Trunk:detail:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
              - Other compatible attribute:
                  - Doesn't say anything about its target Java environment (preferred optimized for Android)

* Try:
Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Exception is:
org.gradle.api.internal.tasks.TaskDependencyResolveException: Could not determine the dependencies of task ':app:compileHongkongDebugJavaWithJavac'.
	at org.gradle.api.internal.tasks.CachingTaskDependencyResolveContext.getDependencies(CachingTaskDependencyResolveContext.java:71)
	at org.gradle.execution.plan.TaskDependencyResolver.resolveDependenciesFor(TaskDependencyResolver.java:46)
	at org.gradle.execution.plan.LocalTaskNode.getDependencies(LocalTaskNode.java:163)
	at org.gradle.execution.plan.LocalTaskNode.resolveDependencies(LocalTaskNode.java:131)
	at org.gradle.execution.plan.DefaultExecutionPlan.doAddNodes(DefaultExecutionPlan.java:186)
	at org.gradle.execution.plan.DefaultExecutionPlan.addEntryTasks(DefaultExecutionPlan.java:150)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph.addEntryTasks(DefaultTaskExecutionGraph.java:157)
	at org.gradle.execution.TaskNameResolvingBuildConfigurationAction.configure(TaskNameResolvingBuildConfigurationAction.java:49)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.configure(DefaultBuildConfigurationActionExecuter.java:55)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.access$000(DefaultBuildConfigurationActionExecuter.java:26)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter$1.proceed(DefaultBuildConfigurationActionExecuter.java:63)
	at org.gradle.execution.DefaultTasksBuildExecutionAction.configure(DefaultTasksBuildExecutionAction.java:45)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.configure(DefaultBuildConfigurationActionExecuter.java:55)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.access$000(DefaultBuildConfigurationActionExecuter.java:26)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter$1.proceed(DefaultBuildConfigurationActionExecuter.java:63)
	at org.gradle.execution.ExcludedTaskFilteringBuildConfigurationAction.configure(ExcludedTaskFilteringBuildConfigurationAction.java:48)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.configure(DefaultBuildConfigurationActionExecuter.java:55)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.lambda$select$0(DefaultBuildConfigurationActionExecuter.java:42)
	at org.gradle.internal.Factories$1.create(Factories.java:31)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry.withMutableStateOfAllProjects(DefaultProjectStateRegistry.java:141)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry.withMutableStateOfAllProjects(DefaultProjectStateRegistry.java:128)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.select(DefaultBuildConfigurationActionExecuter.java:40)
	at org.gradle.initialization.DefaultTaskExecutionPreparer.prepareForTaskExecution(DefaultTaskExecutionPreparer.java:38)
	at org.gradle.initialization.BuildOperationFiringTaskExecutionPreparer$CalculateTaskGraph.populateTaskGraph(BuildOperationFiringTaskExecutionPreparer.java:117)
	at org.gradle.initialization.BuildOperationFiringTaskExecutionPreparer$CalculateTaskGraph.run(BuildOperationFiringTaskExecutionPreparer.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:75)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:153)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:56)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.lambda$run$1(DefaultBuildOperationExecutor.java:71)
	at org.gradle.internal.operations.UnmanagedBuildOperationWrapper.runWithUnmanagedSupport(UnmanagedBuildOperationWrapper.java:45)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:71)
	at org.gradle.initialization.BuildOperationFiringTaskExecutionPreparer.prepareForTaskExecution(BuildOperationFiringTaskExecutionPreparer.java:56)
	at org.gradle.initialization.DefaultGradleLauncher.prepareTaskExecution(DefaultGradleLauncher.java:233)
	at org.gradle.initialization.DefaultGradleLauncher.doClassicBuildStages(DefaultGradleLauncher.java:168)
	at org.gradle.initialization.DefaultGradleLauncher.doBuildStages(DefaultGradleLauncher.java:149)
	at org.gradle.initialization.DefaultGradleLauncher.executeTasks(DefaultGradleLauncher.java:125)
	at org.gradle.internal.invocation.GradleBuildController$1.create(GradleBuildController.java:71)
	at org.gradle.internal.work.DefaultWorkerLeaseService.withLocks(DefaultWorkerLeaseService.java:213)
	at org.gradle.internal.invocation.GradleBuildController.doBuild(GradleBuildController.java:67)
	at org.gradle.internal.invocation.GradleBuildController.run(GradleBuildController.java:56)
	at org.gradle.tooling.internal.provider.runner.BuildModelActionRunner.run(BuildModelActionRunner.java:56)
	at org.gradle.launcher.exec.ChainingBuildActionRunner.run(ChainingBuildActionRunner.java:35)
	at org.gradle.launcher.exec.ChainingBuildActionRunner.run(ChainingBuildActionRunner.java:35)
	at org.gradle.launcher.exec.BuildOutcomeReportingBuildActionRunner.run(BuildOutcomeReportingBuildActionRunner.java:66)
	at org.gradle.tooling.internal.provider.ValidatingBuildActionRunner.run(ValidatingBuildActionRunner.java:32)
	at org.gradle.tooling.internal.provider.FileSystemWatchingBuildActionRunner.run(FileSystemWatchingBuildActionRunner.java:90)
	at org.gradle.launcher.exec.BuildCompletionNotifyingBuildActionRunner.run(BuildCompletionNotifyingBuildActionRunner.java:41)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionRunner$3.call(RunAsBuildOperationBuildActionRunner.java:49)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionRunner$3.call(RunAsBuildOperationBuildActionRunner.java:44)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:200)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:195)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:75)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:153)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:62)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.lambda$call$2(DefaultBuildOperationExecutor.java:76)
	at org.gradle.internal.operations.UnmanagedBuildOperationWrapper.callWithUnmanagedSupport(UnmanagedBuildOperationWrapper.java:54)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:76)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionRunner.run(RunAsBuildOperationBuildActionRunner.java:44)
	at org.gradle.launcher.exec.InProcessBuildActionExecuter.lambda$execute$0(InProcessBuildActionExecuter.java:59)
	at org.gradle.composite.internal.DefaultRootBuildState.run(DefaultRootBuildState.java:86)
	at org.gradle.launcher.exec.InProcessBuildActionExecuter.execute(InProcessBuildActionExecuter.java:58)
	at org.gradle.launcher.exec.InProcessBuildActionExecuter.execute(InProcessBuildActionExecuter.java:30)
	at org.gradle.launcher.exec.BuildTreeScopeLifecycleBuildActionExecuter.lambda$execute$0(BuildTreeScopeLifecycleBuildActionExecuter.java:34)
	at org.gradle.internal.buildtree.BuildTreeState.run(BuildTreeState.java:53)
	at org.gradle.launcher.exec.BuildTreeScopeLifecycleBuildActionExecuter.execute(BuildTreeScopeLifecycleBuildActionExecuter.java:33)
	at org.gradle.launcher.exec.BuildTreeScopeLifecycleBuildActionExecuter.execute(BuildTreeScopeLifecycleBuildActionExecuter.java:28)
	at org.gradle.tooling.internal.provider.ContinuousBuildActionExecuter.execute(ContinuousBuildActionExecuter.java:104)
	at org.gradle.tooling.internal.provider.ContinuousBuildActionExecuter.execute(ContinuousBuildActionExecuter.java:55)
	at org.gradle.tooling.internal.provider.SubscribableBuildActionExecuter.execute(SubscribableBuildActionExecuter.java:64)
	at org.gradle.tooling.internal.provider.SubscribableBuildActionExecuter.execute(SubscribableBuildActionExecuter.java:37)
	at org.gradle.tooling.internal.provider.SessionScopeLifecycleBuildActionExecuter.lambda$execute$0(SessionScopeLifecycleBuildActionExecuter.java:54)
	at org.gradle.internal.session.BuildSessionState.run(BuildSessionState.java:67)
	at org.gradle.tooling.internal.provider.SessionScopeLifecycleBuildActionExecuter.execute(SessionScopeLifecycleBuildActionExecuter.java:50)
	at org.gradle.tooling.internal.provider.SessionScopeLifecycleBuildActionExecuter.execute(SessionScopeLifecycleBuildActionExecuter.java:36)
	at org.gradle.tooling.internal.provider.GradleThreadBuildActionExecuter.execute(GradleThreadBuildActionExecuter.java:36)
	at org.gradle.tooling.internal.provider.GradleThreadBuildActionExecuter.execute(GradleThreadBuildActionExecuter.java:25)
	at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:59)
	at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:31)
	at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:58)
	at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:42)
	at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:47)
	at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:31)
	at org.gradle.launcher.daemon.server.exec.ExecuteBuild.doBuild(ExecuteBuild.java:65)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.WatchForDisconnection.execute(WatchForDisconnection.java:39)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.ResetDeprecationLogger.execute(ResetDeprecationLogger.java:29)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.RequestStopIfSingleUsedDaemon.execute(RequestStopIfSingleUsedDaemon.java:35)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:78)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:75)
	at org.gradle.util.Swapper.swap(Swapper.java:38)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput.execute(ForwardClientInput.java:75)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.LogAndCheckHealth.execute(LogAndCheckHealth.java:55)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.LogToClient.doBuild(LogToClient.java:63)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.EstablishBuildEnvironment.doBuild(EstablishBuildEnvironment.java:84)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.StartBuildOrRespondWithBusy$1.run(StartBuildOrRespondWithBusy.java:52)
	at org.gradle.launcher.daemon.server.DaemonStateCoordinator$1.run(DaemonStateCoordinator.java:297)
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:48)
	at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:56)
Caused by: org.gradle.api.internal.artifacts.ivyservice.DefaultLenientConfiguration$ArtifactResolveException: Could not resolve all task dependencies for configuration ':app:hongkongDebugCompileClasspath'.
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.rethrowFailure(DefaultConfiguration.java:1420)
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$3600(DefaultConfiguration.java:150)
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$DefaultResolutionHost.rethrowFailure(DefaultConfiguration.java:2032)
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$ConfigurationFileCollection.visitDependencies(DefaultConfiguration.java:1378)
	at org.gradle.api.internal.tasks.CachingTaskDependencyResolveContext$TaskGraphImpl.getNodeValues(CachingTaskDependencyResolveContext.java:114)
	at org.gradle.internal.graph.CachingDirectedGraphWalker$GraphWithEmptyEdges.getNodeValues(CachingDirectedGraphWalker.java:213)
	at org.gradle.internal.graph.CachingDirectedGraphWalker.doSearch(CachingDirectedGraphWalker.java:121)
	at org.gradle.internal.graph.CachingDirectedGraphWalker.findValues(CachingDirectedGraphWalker.java:73)
	at org.gradle.api.internal.tasks.CachingTaskDependencyResolveContext.getDependencies(CachingTaskDependencyResolveContext.java:69)
	... 114 more
Caused by: org.gradle.internal.resolve.ModuleVersionResolveException: Could not resolve project :shopwindow.
Required by:
    project :app
Caused by: org.gradle.internal.component.NoMatchingConfigurationSelectionException: No matching variant of project :shopwindow was found. The consumer was configured to find an API of a component, preferably optimized for Android, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but:
  - Variant 'chinaBetaApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'chinaBetaRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'chinaDebugApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'chinaDebugRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'chinaReleaseApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'chinaReleaseRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'china' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'overseaBetaApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'overseaBetaRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'overseaDebugApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'overseaDebugRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'overseaReleaseApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'overseaReleaseRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'oversea' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'southEastAsiaBetaApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'southEastAsiaBetaRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'beta', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'southEastAsiaDebugApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'southEastAsiaDebugRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'southEastAsiaReleaseApiElements' capability 2.3.17Trunk:shopwindow:unspecified declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
  - Variant 'southEastAsiaReleaseRuntimeElements' capability 2.3.17Trunk:shopwindow:unspecified declares a runtime of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm':
      - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release', attribute 'country' with value 'southEastAsia' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'country' with value 'hongkong'
      - Other compatible attribute:
          - Doesn't say anything about its target Java environment (preferred optimized for Android)
	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectConfigurationUsingAttributeMatching(AttributeConfigurationSelector.java:112)
	at org.gradle.internal.component.model.AttributeConfigurationSelector.selectConfigurationUsingAttributeMatching(AttributeConfigurationSelector.java:51)
	at org.gradle.internal.component.model.LocalComponentDependencyMetadata.selectConfigurations(LocalComponentDependencyMetadata.java:144)
	at org.gradle.internal.component.local.model.DslOriginDependencyMetadataWrapper.selectConfigurations(DslOriginDependencyMetadataWrapper.java:71)
	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.calculateTargetConfigurations(EdgeState.java:265)
	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.EdgeState.attachToTargetConfigurations(EdgeState.java:150)
	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.attachToTargetRevisionsSerially(DependencyGraphBuilder.java:375)
	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolveEdges(DependencyGraphBuilder.java:260)
	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.traverseGraph(DependencyGraphBuilder.java:197)
	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.graph.builder.DependencyGraphBuilder.resolve(DependencyGraphBuilder.java:148)
	at org.gradle.api.internal.artifacts.ivyservice.resolveengine.DefaultArtifactDependencyResolver.resolve(DefaultArtifactDependencyResolver.java:145)
	at org.gradle.api.internal.artifacts.ivyservice.DefaultConfigurationResolver.resolveBuildDependencies(DefaultConfigurationResolver.java:136)
	at org.gradle.api.internal.artifacts.ivyservice.ShortCircuitEmptyConfigurationResolver.resolveBuildDependencies(ShortCircuitEmptyConfigurationResolver.java:76)
	at org.gradle.api.internal.artifacts.ivyservice.ErrorHandlingConfigurationResolver.resolveBuildDependencies(ErrorHandlingConfigurationResolver.java:63)
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.lambda$resolveGraphForBuildDependenciesIfRequired$6(DefaultConfiguration.java:847)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$CalculatedModelValueImpl.update(DefaultProjectStateRegistry.java:362)
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.resolveGraphForBuildDependenciesIfRequired(DefaultConfiguration.java:843)
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.access$1800(DefaultConfiguration.java:150)
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getTaskDependencyValue(DefaultConfiguration.java:1335)
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$SelectedArtifactsProvider.getTaskDependencyValue(DefaultConfiguration.java:1331)
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration$ConfigurationFileCollection.visitDependencies(DefaultConfiguration.java:1374)
	at org.gradle.api.internal.tasks.CachingTaskDependencyResolveContext$TaskGraphImpl.getNodeValues(CachingTaskDependencyResolveContext.java:114)
	at org.gradle.internal.graph.CachingDirectedGraphWalker$GraphWithEmptyEdges.getNodeValues(CachingDirectedGraphWalker.java:213)
	at org.gradle.internal.graph.CachingDirectedGraphWalker.doSearch(CachingDirectedGraphWalker.java:121)
	at org.gradle.internal.graph.CachingDirectedGraphWalker.findValues(CachingDirectedGraphWalker.java:73)
	at org.gradle.api.internal.tasks.CachingTaskDependencyResolveContext.getDependencies(CachingTaskDependencyResolveContext.java:69)
	at org.gradle.execution.plan.TaskDependencyResolver.resolveDependenciesFor(TaskDependencyResolver.java:46)
	at org.gradle.execution.plan.LocalTaskNode.getDependencies(LocalTaskNode.java:163)
	at org.gradle.execution.plan.LocalTaskNode.resolveDependencies(LocalTaskNode.java:131)
	at org.gradle.execution.plan.DefaultExecutionPlan.doAddNodes(DefaultExecutionPlan.java:186)
	at org.gradle.execution.plan.DefaultExecutionPlan.addEntryTasks(DefaultExecutionPlan.java:150)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph.addEntryTasks(DefaultTaskExecutionGraph.java:157)
	at org.gradle.execution.TaskNameResolvingBuildConfigurationAction.configure(TaskNameResolvingBuildConfigurationAction.java:49)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.configure(DefaultBuildConfigurationActionExecuter.java:55)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.access$000(DefaultBuildConfigurationActionExecuter.java:26)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter$1.proceed(DefaultBuildConfigurationActionExecuter.java:63)
	at org.gradle.execution.DefaultTasksBuildExecutionAction.configure(DefaultTasksBuildExecutionAction.java:45)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.configure(DefaultBuildConfigurationActionExecuter.java:55)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.access$000(DefaultBuildConfigurationActionExecuter.java:26)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter$1.proceed(DefaultBuildConfigurationActionExecuter.java:63)
	at org.gradle.execution.ExcludedTaskFilteringBuildConfigurationAction.configure(ExcludedTaskFilteringBuildConfigurationAction.java:48)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.configure(DefaultBuildConfigurationActionExecuter.java:55)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.lambda$select$0(DefaultBuildConfigurationActionExecuter.java:42)
	at org.gradle.internal.Factories$1.create(Factories.java:31)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry.withMutableStateOfAllProjects(DefaultProjectStateRegistry.java:141)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry.withMutableStateOfAllProjects(DefaultProjectStateRegistry.java:128)
	at org.gradle.execution.DefaultBuildConfigurationActionExecuter.select(DefaultBuildConfigurationActionExecuter.java:40)
	at org.gradle.initialization.DefaultTaskExecutionPreparer.prepareForTaskExecution(DefaultTaskExecutionPreparer.java:38)
	at org.gradle.initialization.BuildOperationFiringTaskExecutionPreparer$CalculateTaskGraph.populateTaskGraph(BuildOperationFiringTaskExecutionPreparer.java:117)
	at org.gradle.initialization.BuildOperationFiringTaskExecutionPreparer$CalculateTaskGraph.run(BuildOperationFiringTaskExecutionPreparer.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:75)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:153)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:56)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.lambda$run$1(DefaultBuildOperationExecutor.java:71)
	at org.gradle.internal.operations.UnmanagedBuildOperationWrapper.runWithUnmanagedSupport(UnmanagedBuildOperationWrapper.java:45)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:71)
	at org.gradle.initialization.BuildOperationFiringTaskExecutionPreparer.prepareForTaskExecution(BuildOperationFiringTaskExecutionPreparer.java:56)
	at org.gradle.initialization.DefaultGradleLauncher.prepareTaskExecution(DefaultGradleLauncher.java:233)
	at org.gradle.initialization.DefaultGradleLauncher.doClassicBuildStages(DefaultGradleLauncher.java:168)
	at org.gradle.initialization.DefaultGradleLauncher.doBuildStages(DefaultGradleLauncher.java:149)
	at org.gradle.initialization.DefaultGradleLauncher.executeTasks(DefaultGradleLauncher.java:125)
	at org.gradle.internal.invocation.GradleBuildController$1.create(GradleBuildController.java:71)
	at org.gradle.internal.work.DefaultWorkerLeaseService.withLocks(DefaultWorkerLeaseService.java:213)
	at org.gradle.internal.invocation.GradleBuildController.doBuild(GradleBuildController.java:67)
	at org.gradle.internal.invocation.GradleBuildController.run(GradleBuildController.java:56)
	at org.gradle.tooling.internal.provider.runner.BuildModelActionRunner.run(BuildModelActionRunner.java:56)
	at org.gradle.launcher.exec.ChainingBuildActionRunner.run(ChainingBuildActionRunner.java:35)
	at org.gradle.launcher.exec.ChainingBuildActionRunner.run(ChainingBuildActionRunner.java:35)
	at org.gradle.launcher.exec.BuildOutcomeReportingBuildActionRunner.run(BuildOutcomeReportingBuildActionRunner.java:66)
	at org.gradle.tooling.internal.provider.ValidatingBuildActionRunner.run(ValidatingBuildActionRunner.java:32)
	at org.gradle.tooling.internal.provider.FileSystemWatchingBuildActionRunner.run(FileSystemWatchingBuildActionRunner.java:90)
	at org.gradle.launcher.exec.BuildCompletionNotifyingBuildActionRunner.run(BuildCompletionNotifyingBuildActionRunner.java:41)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionRunner$3.call(RunAsBuildOperationBuildActionRunner.java:49)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionRunner$3.call(RunAsBuildOperationBuildActionRunner.java:44)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:200)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:195)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:75)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$3.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:153)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:68)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:62)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.lambda$call$2(DefaultBuildOperationExecutor.java:76)
	at org.gradle.internal.operations.UnmanagedBuildOperationWrapper.callWithUnmanagedSupport(UnmanagedBuildOperationWrapper.java:54)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:76)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionRunner.run(RunAsBuildOperationBuildActionRunner.java:44)
	at org.gradle.launcher.exec.InProcessBuildActionExecuter.lambda$execute$0(InProcessBuildActionExecuter.java:59)
	at org.gradle.composite.internal.DefaultRootBuildState.run(DefaultRootBuildState.java:86)
	at org.gradle.launcher.exec.InProcessBuildActionExecuter.execute(InProcessBuildActionExecuter.java:58)
	at org.gradle.launcher.exec.InProcessBuildActionExecuter.execute(InProcessBuildActionExecuter.java:30)
	at org.gradle.launcher.exec.BuildTreeScopeLifecycleBuildActionExecuter.lambda$execute$0(BuildTreeScopeLifecycleBuildActionExecuter.java:34)
	at org.gradle.internal.buildtree.BuildTreeState.run(BuildTreeState.java:53)
	at org.gradle.launcher.exec.BuildTreeScopeLifecycleBuildActionExecuter.execute(BuildTreeScopeLifecycleBuildActionExecuter.java:33)
	at org.gradle.launcher.exec.BuildTreeScopeLifecycleBuildActionExecuter.execute(BuildTreeScopeLifecycleBuildActionExecuter.java:28)
	at org.gradle.tooling.internal.provider.ContinuousBuildActionExecuter.execute(ContinuousBuildActionExecuter.java:104)
	at org.gradle.tooling.internal.provider.ContinuousBuildActionExecuter.execute(ContinuousBuildActionExecuter.java:55)
	at org.gradle.tooling.internal.provider.SubscribableBuildActionExecuter.execute(SubscribableBuildActionExecuter.java:64)
	at org.gradle.tooling.internal.provider.SubscribableBuildActionExecuter.execute(SubscribableBuildActionExecuter.java:37)
	at org.gradle.tooling.internal.provider.SessionScopeLifecycleBuildActionExecuter.lambda$execute$0(SessionScopeLifecycleBuildActionExecuter.java:54)
	at org.gradle.internal.session.BuildSessionState.run(BuildSessionState.java:67)
	at org.gradle.tooling.internal.provider.SessionScopeLifecycleBuildActionExecuter.execute(SessionScopeLifecycleBuildActionExecuter.java:50)
	at org.gradle.tooling.internal.provider.SessionScopeLifecycleBuildActionExecuter.execute(SessionScopeLifecycleBuildActionExecuter.java:36)
	at org.gradle.tooling.internal.provider.GradleThreadBuildActionExecuter.execute(GradleThreadBuildActionExecuter.java:36)
	at org.gradle.tooling.internal.provider.GradleThreadBuildActionExecuter.execute(GradleThreadBuildActionExecuter.java:25)
	at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:59)
	at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:31)
	at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:58)
	at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:42)
	at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:47)
	at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:31)
	at org.gradle.launcher.daemon.server.exec.ExecuteBuild.doBuild(ExecuteBuild.java:65)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.WatchForDisconnection.execute(WatchForDisconnection.java:39)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.ResetDeprecationLogger.execute(ResetDeprecationLogger.java:29)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.RequestStopIfSingleUsedDaemon.execute(RequestStopIfSingleUsedDaemon.java:35)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:78)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:75)
	at org.gradle.util.Swapper.swap(Swapper.java:38)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput.execute(ForwardClientInput.java:75)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.LogAndCheckHealth.execute(LogAndCheckHealth.java:55)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.LogToClient.doBuild(LogToClient.java:63)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.EstablishBuildEnvironment.doBuild(EstablishBuildEnvironment.java:84)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.StartBuildOrRespondWithBusy$1.run(StartBuildOrRespondWithBusy.java:52)
	at org.gradle.launcher.daemon.server.DaemonStateCoordinator$1.run(DaemonStateCoordinator.java:297)
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:48)
	at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:56)

```

异常描述：

导致问题的是shopwindow module 的flavor 配置。 而该问题由于app module 构建触发。  

具体是因为app module中的 hongkong flavor，在shopwindow module 未找到配置的hongkong flavor，里面也提到了home module，问题是相同的。  这种问题解决起来只需要在app module 具体的hongkong
flavor中配置 回滚 flavor即可。

```java
app的build.gradle
  hongkong {
            versionName build_versions.hongkong_version_name
            versionCode build_versions.hongkong_version_code
            //签名文件
            signingConfig signingConfigs.overseaReleaseConfig
            dimension "country"
            matchingFallbacks = ['hongkong']
        }
        
       在shopwindoww module 中新建配置flavor

```


注意这里并非必须新建配置的flavor，找一个替代flavor进行配置也同样是可以，这里新建flavor的原因是 shopwindow  module 依赖的库模块中定义了hongkong flavor,用来标识具体的变量



