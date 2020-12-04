pipeline {
  agent {
    docker {
      image 'maven:3.6-openjdk-11'
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