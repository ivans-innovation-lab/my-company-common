pipeline {
    agent any
    tools { 
        maven 'maven-3' 
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean deploy -DaltDeploymentRepository=artifactory-local-snapshots::default::http://artifactory:8081/artifactory/libs-snapshot-local'
            }
        }
    }
}
