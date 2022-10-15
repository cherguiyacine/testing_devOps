pipeline {
  agent any
  stages {
       stage('Mail notificationn') {
      steps {
        mail(subject: 'Build Project', body: 'The build was successful', cc: 'hb_chergui@esi.dz')
      }
    }

  }
}
