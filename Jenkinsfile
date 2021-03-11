pipeline {
  agent any
  stages {
    stage('sonar') {
      steps {
        sh '           "${tool("sonarqube")}/bin/sonar-scanner'
      }
    }

  }
  environment {
    scannerHome = 'SonarQube'
  }
}