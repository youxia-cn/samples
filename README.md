# samples
该代码仓库中存放的是我的博客 [http://www.cnblogs.com/youxia](http://www.cnblogs.com/youxia) 中的和 Java 有关的随笔中涉及的源代码。其具体内容如下：

1. HelloWorld 目录：是一个 Eclipse 项目，就是最简单的 HelloWorld 示例程序。其对应的随笔是这篇 [Java 程序的打包、签名和验证](http://www.cnblogs.com/youxia/p/java003.html)。
2. SecurityDemo 目录：是一个 Eclipse 项目，展示了使用 SecurityManager 和 Policy File 管理 Java 程序的权限。其对应的随笔是这篇 [使用 SecurityManager 和 Policy File 管理 Java 程序的权限](http://www.cnblogs.com/youxia/p/java004.html)。
 运行该示例的方式：
 
 `java com.xkland.sample.SecurityDemo getProps        #访问 Java 运行环境中的 Properties`
 
 `java com.xkland.sample.SecurityDemo count filename  #统计由 filename 指定的文件占用的字节`

3. JaasDemo：是一个 Eclipse 项目，是 Java 中的 JAAS 概念的一个简单展示。其对应的随笔是这篇 [JAAS 是个什么梗](http://www.cnblogs.com/youxia/p/java006.html)。
4. JavaIODemo：是一个 Eclipse 项目，展示了 Java I/O 中一些 API 的用法。其对应的随笔是这篇 [这些年一直记不住的 Java I/O](http://www.cnblogs.com/youxia/p/java007.html)。
 运行该示例的方式：
 
 `java com.xkland.sample.JavaIODemo copyBytes filename        #复制由 filename 指定的文件中的字节到控制台`
 
 `java com.xkland.sample.JavaIODemo binaryWrite filename      #以二进制格式将数据写入由 filename 指定的文件`
 
 `java com.xkland.sample.JavaIODemo formatWrite filename      #以可阅读格式将数据写入由 filename 指定的文件`
 
 `java com.xkland.sample.JavaIODemo showAttributes filename   #显示由 filename 指定的文件的属性`
