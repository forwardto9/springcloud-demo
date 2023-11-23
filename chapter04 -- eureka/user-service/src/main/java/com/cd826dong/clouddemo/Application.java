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
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

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
* */
//@EnableEurekaClient
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
