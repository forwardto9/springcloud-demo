/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cd826dong.clouddemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * SpringCloud示例工程 -- 用户服务
 *
 * @author CD826(CD826Dong@gmail.com)
 * @since 1.0.0
 */
@EnableDiscoveryClient
/*
* 若加了这个注解，则pom.xml的依赖是<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
*
* 当你在 Spring Boot 应用中使用 @EnableEurekaClient 注解时，该应用将具备以下功能：
* 将自身作为一个服务实例注册到 Eureka 服务器，以便其他服务可以发现和调用它。
* 从 Eureka 服务器获取其他服务实例的信息，以便在需要时调用其他服务。
*
*
* Both `@EnableDiscoveryClient` and `@EnableEurekaClient` annotations are used to enable service discovery in a Spring Boot application. However, there is a subtle difference between them.

`@EnableDiscoveryClient` is a general-purpose annotation that enables service discovery for any service registry implementation. It is part of the Spring Cloud Commons library and can be used with any service registry, including Eureka, Consul, ZooKeeper, and others.

On the other hand, `@EnableEurekaClient` is a specific annotation that enables service discovery for the Eureka service registry implementation only. It is part of the Spring Cloud Netflix library and is used only for Eureka service discovery.

In other words, `@EnableDiscoveryClient` is more generic and can work with any service registry implementation, while `@EnableEurekaClient` is specific to Eureka and provides some additional features that are specific to Eureka, such as the ability to use Spring Cloud Netflix's `DiscoveryClient` implementation.

In most cases, it is recommended to use `@EnableDiscoveryClient` as it provides more flexibility and allows you to switch to a different service registry implementation in the future if needed. However, if you are using Eureka and want to take advantage of some of its specific features, you can use `@EnableEurekaClient`.
* */
//@EnableEurekaClient
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
