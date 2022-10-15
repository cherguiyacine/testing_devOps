pipeline {
  agent any
  stages {
    stage('Affichage') {
      steps {
        echo 'Hey Yacine'
      }
    }

    stage('aff2') {
      steps {
        echo 'secondo'
      }
    }

    stage('Notification') {
      steps {
        mail(subject: 'Mail notification', body: 'Hey', cc: 'hb_chergui@esi.dz')
      }
    }

  }
}