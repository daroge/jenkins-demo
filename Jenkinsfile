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
        sh 'mvn clean sonar:sonar -Dsonar.host.url=http://172.24.0.4:9000'
        withSonarQubeEnv(installationName: 'sonarqube', credentialsId: 'sonar')
      }
    }

  }
}