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
        mail(subject: 'New Commit', body: 'Hey Chergui', cc: 'hb_chergui@esi.dz')
      }
    }

  }
}