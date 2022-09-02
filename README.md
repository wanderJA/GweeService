# GweeService
添加maven依赖

```
   maven {
            url = uri("https://maven.pkg.github.com/wanderJA/GweeService")
            credentials {
                username = name
                password = token_key
            }
        }
      
 ```
 
  工程build.gradle中增加ksp plugin
 ```
 plugins {
    id 'com.google.devtools.ksp' version '1.7.10-1.0.6' apply(false)
}
````

mudule gradle进行如下配置
```
/**
 * auto service 配置
 */
apply plugin:'com.google.devtools.ksp'

dependencies {
    api 'com.google.auto.service:auto-service-annotations:1.0'
    ksp "com.gwee.service:ksp:1.0.0"
}
```
