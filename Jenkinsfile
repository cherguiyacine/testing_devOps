pipeline {
  agent any
  stages {
    stage('Notification') {
      steps {
        mail(subject: 'New Commit', body: 'Hey ', cc: 'hb_chergui@esi.dz')
      }
    }

  }
}