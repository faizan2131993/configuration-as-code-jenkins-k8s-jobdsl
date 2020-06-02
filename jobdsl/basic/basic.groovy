pipelineJob('basic') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('https://github.com/faizan2131993/configuration-as-code-jenkins-k8s-pipeline.git')
            }
          }
        }
        scriptPath("basic/Jenkinsfile")
    }
  }
}
