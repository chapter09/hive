#!/bin/bash 
VERSION=apache-hive-2.0.0-SNAPSHOT-bin

# create directory is not present
${HADOOP_HOME}/bin/hdfs dfs -mkdir -p /apps/${VERSION}

# remove already existing file
${HADOOP_HOME}/bin/hdfs dfs -rm /apps/${VERSION}/${VERSION}.tar.gz
${HADOOP_HOME}/bin/hdfs dfs -copyFromLocal ${CODE_DIR}/hive/packaging/target/${VERSION}.tar.gz /apps/${VERSION}

${HADOOP_HOME}/bin/hdfs dfs -rm /apps/${VERSION}/hive-exec-2.0.0-SNAPSHOT.jar
${HADOOP_HOME}/bin/hdfs dfs -copyFromLocal ${CODE_DIR}/hive/packaging/target/apache-hive-2.0.0-SNAPSHOT-bin/apache-hive-2.0.0-SNAPSHOT-bin/lib/hive-exec-2.0.0-SNAPSHOT.jar /apps/${VERSION}
