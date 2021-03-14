pipeline {
  agent {
    docker {
      image 'adoptopenjdk/maven-openjdk11'
      args '--net="daroge_sonarnet"'
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
        withSonarQubeEnv(installationName: 'sonarqube', credentialsId: 'sonar-jenkins') {
          sh 'mvn clean verify sonar:sonar'
        }

      }
    }

    stage('quality gate') {
      steps {
        waitForQualityGate(credentialsId: 'sonar', abortPipeline: true)
      }
    }

  }
}