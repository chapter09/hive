#!/bin/bash 
VERSION=apache-hive-2.0.0-SNAPSHOT-bin

${HADOOP_HOME}/bin/hdfs dfs -mkdir -p /apps/${VERSION}

${HADOOP_HOME}/bin/hdfs dfs -rm /apps/${VERSION}/${VERSION}.tar.gz
${HADOOP_HOME}/bin/hdfs dfs -copyFromLocal /users/raajay86/code-netopt/hive/packaging/target/${VERSION}.tar.gz /apps/${VERSION}

${HADOOP_HOME}/bin/hdfs dfs -rm /apps/${VERSION}/hive-exec-2.0.0-SNAPSHOT.jar
${HADOOP_HOME}/bin/hdfs dfs -copyFromLocal /users/raajay86/code-netopt/hive/packaging/target/apache-hive-2.0.0-SNAPSHOT-bin/apache-hive-2.0.0-SNAPSHOT-bin/lib/hive-exec-2.0.0-SNAPSHOT.jar /apps/${VERSION}
