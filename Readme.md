# HomeClient Project

## JavaPackager

JavaPackager-0.8.4_Modified.zip contains the modified version of Javapackager code to genarate app files for Mac OS.

Currently, the javapackager code is built and the genarted jar file is uploaded to nexus in the following location:
"http://nexus.tomtomgroup.com:8080/nexus/content/repositories/releases/fvarrui/maven/javapackager/0.8.4/".

1.In cases if the jar is misplaced or lost, extract the code JavaPackager-0.8.4_Modified and build it in local for local build creation (Mac OS).
2.Or for uploading in nexus releases repository use the following Jenkins job:
https://cloudbees-core.tomtomgroup.com/as-css/job/Home2Client/job/Test_JavaPackager/

Note:In both the cases,the location of the generated Javapackager jar has to be replaced in the pom file of HomeclientUI module.

Disclaimer: 
Since this Javapackager code used is from Github public repository and modified as per our requirements, do not use the code into our project or bundle the jar along with H2C application without any credits or appropriate licensing to the creator.