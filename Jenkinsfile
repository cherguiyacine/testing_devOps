pipeline {
  agent any
  stages {
    stage('Mail Notification') {
      steps {
        mail(subject: 'New commit', body: 'i have do some changes', cc: 'hb_chergui@esi.dz')
      }
    }

    stage('email') {
      steps {
        mail(subject: 'fe', body: 'lk', cc: 'hb_chergui@esi.dz')
      }
    }

  }
}