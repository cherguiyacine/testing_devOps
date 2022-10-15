pipeline {
  agent any
  stages {
    stage('Notification') {
      steps {
        mail(subject: 'New Commit', body: 'Hey  saida', cc: 'hb_chergui@esi.dz')
      }
    }

  }
}