pipeline {
  agent {
    docker {
      image 'adoptopenjdk/openjdk11:jdk-11.0.2.9'
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