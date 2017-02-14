pipeline {
    agent any
    tools { 
        maven 'maven-3' 
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean deploy -DaltDeploymentRepository=artifactory-local-snapshots::default::http://172.18.0.2:9091/artifactory/libs-snapshot-local'
            }
        }
    }
}
