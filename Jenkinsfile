pipeline {
  agent {
    docker {
      image 'adoptopenjdk/maven-openjdk11:latest'
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