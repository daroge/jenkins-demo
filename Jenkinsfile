pipeline {
  agent {
    docker {
      image 'adoptopenjdk/maven-openjdk11'
    }

  }
  stages {
    stage('test') {
      steps {
        sh '           mvn -B test'
      }
    }

    stage('build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }

    stage('sonar') {
      steps {
        sh 'mvn clean sonar:sonar'
      }
    }

  }
}