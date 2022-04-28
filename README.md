# zeus

趣味開発のバックエンド全般

## local

batch

```shell
gradle :zeus:batch:build

```

## domain

[zeus-api.ningenme.net](https://zeus-api.ningenme.net)

## document

|            |url                             |  
|----------- |------------------------------- |  
|swagger     | |
|javadoc     | |  
|test        | |  
|jacoco      | |  

## architecture

|            |      architecuture             |  
|----------- |------------------------------- |  
|routing     | auto load balancer             |
|hosting     | ecs                            |  
|ci/cd       | github actions, aws codedeploy |  
|application | kotlin + Spring Boot           |  

## history

|version  |repository                                                       |tech stack|  
|------   |---------                                                        |----------- |  
|v4 (this)|[zeus](https://github.com/ningenMe/zeus)                         |spring + ecs|
|v3       |[net-api](https://github.com/ningenMe/net-api)                   |spring + ecs|  
|v2       |[ningenme-net-api](https://github.com/ningenMe/ningenme-net-api) |spring + ec2|  
|v1       |[ningenMe.net.API](https://github.com/ningenMe/ningenMe.net.API) |laravel + ec2|  
