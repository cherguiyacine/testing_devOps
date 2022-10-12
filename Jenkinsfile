pipeline {
  agent any
  stages {
    stage('Mail Notification') {
      steps {
        mail(subject: 'New commit', body: 'i have do some changes', cc: 'hb_chergui@esi.dz')
      }
    }

  }
}