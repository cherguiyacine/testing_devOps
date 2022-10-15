pipeline {
  agent any
  stages {
    stage('shel') {
      steps {
        sh 'echo \'hey\''
      }
    }
    

    
    stage('NOTIF') {
      steps {
        
        mail(subject: 'HKJ', body: 'HGJHG', cc: 'HB@ESI.DZ')
      }
    }

  }
}
