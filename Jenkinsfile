pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
    }

  }
  stages {
    stage('test') {
      steps {
        sh '           mvn -B clean test'
      }
    }

    stage('build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }

  }
}