pipeline {
  agent any
  stages {
    stage('sonar') {
      steps {
        sh '           "${tool("sonarscanner")}/bin/sonar-scanner'
      }
    }

  }
  environment {
    scannerHome = 'SonarQube'
  }
}