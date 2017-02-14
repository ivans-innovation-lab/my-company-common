pipeline {
    agent any
    tools { 
        maven 'maven-3' 
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean deploy -DaltDeploymentRepository=artifactory-local-snapshots::default::http://192.168.21.174/:9091/artifactory/libs-snapshot-local'
            }
        }
    }
}
