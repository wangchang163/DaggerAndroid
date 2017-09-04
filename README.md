# DaggerAndroid
Dagger在mvp模式中的使用

## 引用：
### step1：
在app Module的dependencies中添加

      apt "com.google.dagger:dagger-compiler:$rootProject.daggerVersion"
      compile "com.google.dagger:dagger:$rootProject.daggerVersion"

并添加插件
     
      apply plugin: 'com.neenbedankt.android-apt'
      
### step2：

在Project gradle中的dependencies添加

      //添加apt插件
      classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
      
      
### 版本号封装：

     ext {
           compileSdkVersion = 26
           buildToolsVersion = '26.0.1'
           applicationId = 'com.wangchang.daggerandroid'
           minSdkVersion = 15
           targetSdkVersion = 26
           versionCode = 1
           versionName = '1.0'
           //App dependencies
           supportLibraryVersion = '25.3.1'
           espressoVersion='2.2.2'
           junitVersion='4.12'
           daggerVersion='2.4'
    }
    
    
## 使用简介

1：在Test类中

    public class Test {
        private String str;

        @Inject
        public Test() {
        str = "测试Dagger";
        }

       public String getStr() {
        return str;
        }

    }
    
通过@Inject标记构造函数，将对象注入到目标对象中

2：创建component

     @Component(modules = ActivityModule.class)
     public interface ActivityComponent {
     void inject(MainActivity mainActivity);
    }

component作为一个中间桥梁，将Test类和MainActivity关联到一起

3：在MainActivity的onCreate中

    DaggerActivityComponent.builder()
                .activityModule(new ActivityModule((BaseView) this))
                .build()
                .inject(this);
                
4：获取对象（在MainActivity中）

       @Inject
       Test test;


实例化如果不通过@inject来实现，也可以通过@Provides来实现

在Module中添加

    @Provides
    Test2 provideTest() {
        return new Test2();
    }
来实例化Test2类

component中将其注入到MainActivity，在MainActivity中调用

      @Inject
      Test2 test2;
      
即可引用test2对象