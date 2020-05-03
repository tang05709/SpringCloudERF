# 个人学习


项目包括Spring Cloud注册于服务发现相关内容，教程来源于尚硅谷，阳哥主讲： Spring Cloud教程
本项目包括属于Spring Cloud基础部分

技术包括
- Spring Cloud Eureka
- Spring Cloud Ribbon
- Spring Cloud Feign
- Spring Cloud OpenFeign
- Spring Cloud Zookeeper


项目说明
- tcloud-api-commons 公共基础包
- tcloud-eureka-server7001 Eureka注册中心集群1
- tcloud-eureka-server7002 Eureka注册中心集群2
- tcloud-provider-payment8001 Eureka服务提供者1
- tcloud-provider-payment8002 Eureka服务提供者2
- tcloud-provider-payment8003 Eureka服务提供者3
- tcloud-customer-order80 Eureka服务消费者 Ribbon+RestTemplate负载均衡
- tcloud-provider-payment8004 Zookeeper服务提供者
- tcloud-customerzk-order80 Zookeeper服务消费者
- tcloud-customer-feign-order80 Feign