pipeline {
  agent any
  stages {
    stage('shel') {
      steps {
        sh 'echo \'hey there\''
      }
    }

    stage('NOTIF') {
      steps {
        mail(subject: 'HKJ', body: 'HGffJHGddfazdddfzefesjlkj', cc: 'HB@ESI.DZ')
      }
    }

  }
}