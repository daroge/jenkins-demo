pipeline {
  agent any
  stages {
    stage('sonar') {
      steps {
        sh '''         withSonarQubeEnv(\'sonarqube\') {
            sh "${scannerHome}/bin/sonar-scanner"
        }timeout(time: 10, unit: \'MINUTES\') {
            waitForQualityGate abortPipeline: true
        }

'''
        }
      }

    }
    environment {
      scannerHome = 'SonarQube'
    }
  }