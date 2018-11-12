# 数据迁移及升级版本管理项目模板(解决复杂的数据迁移及升级)

项目主要使用Flyway工具进行数据升级管理,该项目是数据迁移和升级的基于springboot的模板项目，没有具体的实现。

Flyway是一款开源的数据库版本管理工具，Flyway可以独立于应用实现管理并跟踪数据库的变更，Flyway根据自己的约定，不需要复杂的配置就可以实现数据的Migrate。Migrations可以写成SQL脚本，也可以写在Java代码中。

Flyway的运行机制很简单，其中Migrate是Flyway工作流的核心功能，主要目的就是把数据库Schema迁移到最新版本，Flyway每次在执行Migrate的时候会检测你的数据库中的flyway_schema_history表，如果它没有检测到，会自动创建一张新的flyway_schema_history(可以自己配置)表用于版本控制。当检测到你有新的版本需要迁移的时候，Flyway会逐一比对flyway_schema_history表中的已存在的版本记录，如果有未应用的Migrations，Flyway会获取这些Migrations并按次序Apply到数据库中，否则不需要做任何事情。另外，通常在应用程序启动时应默认执行Migrate操作(该项目没有在应用程序启动执行)，从而避免程序和数据库的不一致性

项目运行
      
      1.编辑器中运行：mvn spring-boot:run即可
      
      2.打成jar包运行：java -jar data-migration-1.0.0-SNAPSHOT.jar --spring.config.location=file:./config/（./config/为实际的配置文件目录）
      
有关Flyway的详细使用请参考博客：
      
