pipeline {
  agent any
  stages {
    stage('sonar') {
      steps {
        sh '           "${scannerHome}/bin/sonar-scanner"'
      }
    }

  }
  environment {
    scannerHome = 'SonarQube'
  }
}