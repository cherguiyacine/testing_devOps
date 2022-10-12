pipeline {
  agent any
  stages {
    stage('Mail Notification') {
      
      steps {
        mail(subject: 'new commit', body: 'Hey ', cc: 'hb_chergui@esi.dz')
      }
    }

  }
}
