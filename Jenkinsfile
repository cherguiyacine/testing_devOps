pipeline {
  agent any
  stages {
    stage('Affichage') {
      steps {
        echo 'Hey Yacine'
      }
    }

    stage('Notifiication') {
      steps {
        mail(subject: 'New Commit', body: 'Hey', cc: 'hb_chergui@esi.dz')
      }
    }

  }
}