pipeline {
  agent any
  stages {
    stage('mail notification') {
      steps {
        
        mail(subject: 'New commit ', body: 'Test', cc: 'hb_chergui@esi.dz', to: 'hb_chergui@esi.dz')
      }
    }

  }
}
