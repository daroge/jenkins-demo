pipeline {
  agent {
    docker {
      image 'maven:3.6-openjdk-11'
      args 'args \'-u root --privileged\''
    }

  }
  stages {
    stage('Initialize') {
      steps {
        sh 'mvn clean package'
      }
    }

  }
}