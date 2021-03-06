# lrn-java8-fp

## Maven 

### Build Commands

#### General

```bash
mvn package
mvn install
mvn test
mvn verify
```

#### Project Generation
```bash
# Parent
mvn archetype:generate -DgroupId=com.wayne -DartifactId=lrn-java-fp
# Core submodule
mvn archetype:generate -DgroupId=com.wayne -DartifactId=core
```

## Build Info
Apache Maven 3.5.3 (3383c37e1f9e9b3bc3df5050c29c8aff9f295297; 2018-02-24T12:49:05-07:00)  
Maven home: /usr/local/Cellar/maven/3.5.3/libexec  
Java version: 1.8.0_192, vendor: Oracle Corporation  
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre  
Default locale: en_US, platform encoding: UTF-8  
OS name: "mac os x", version: "10.14", arch: "x86_64", family: "mac"

### [jEnv](http://www.jenv.be/)  

#### Install  

```bash
brew install jenv
echo 'export PATH="$HOME/.jenv/bin:$PATH"' >> ~/.zshrc
echo 'eval "$(jenv init -)"' >> ~/.zshrc

```
  
#### Add Command
```bash
jenv add ~/development/tools/jdk-11.0.1.jdk/Contents/Home
```