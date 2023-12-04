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
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * SpringCloud示例工程 -- 商品服务
 *
 * @author CD826(CD826Dong@gmail.com)
 * @since 1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    @Bean(value = "restTemplate")
    /*
    `@LoadBalanced` 注解是 Spring Cloud 中的一个重要注解，它用于开启客户端负载均衡功能。
    当你在使用 `RestTemplate` 调用其他服务时，如果没有使用 `@LoadBalanced` 注解，
    那么 `RestTemplate` 将无法解析服务名，因为它不知道如何将服务名映射到具体的实例。

    在微服务架构中，服务实例可能有多个，而且它们的地址可能会发生变化。
    `@LoadBalanced` 注解告诉 `RestTemplate` 使用负载均衡器（例如 Ribbon）来处理服务名的解析和请求分发。
    这样，你可以使用服务名而不是硬编码的地址来调用其他服务，负载均衡器会自动选择一个可用的服务实例并将请求转发给它。
    总结一下，`@LoadBalanced` 注解的作用主要有两点：
    1. 使 `RestTemplate` 能够解析服务名，而不是直接使用 IP 地址和端口号。
    2. 开启客户端负载均衡功能，自动选择可用的服务实例进行调用。
    因此，在使用 `RestTemplate` 调用其他服务时，需要加上 `@LoadBalanced` 注解以确保正确的服务发现和负载均衡功能。
    * */
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
