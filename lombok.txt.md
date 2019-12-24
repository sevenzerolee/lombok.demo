# Lombok for eclipse

```config
1.将 lombok.jar 文件复制到 eclipse 根目录
(注意版本：Kepler Service Release 2 使用太高版本的 lombok 不行，1.16.12)

2.eclipse.ini 文件末尾添加 -javaagent:/home/lb/software/eclipse/lombok.jar，然后重新启动软件

3.项目中添加 lombok 依赖
    <dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<version>1.18.10</version>
		<scope>provided</scope>
	</dependency>
```
