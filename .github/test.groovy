import groovy.json.JsonSlurper

if (System.env.GITHUB_ACTIONS) {
    def jobName = System.env.GITHUB_JOB

    if (System.env.GITHUB_EVENT_NAME == "pull_request" && System.env.GITHUB_EVENT_PATH != null) {
        File eventJsonFile = new File(System.env.GITHUB_EVENT_PATH)
        if (Files.exists(eventJsonFile)) {
            def eventJson = new JsonSlurper().parse(eventJsonFile)
            def prNumber = eventJson.pull_request?.number

            if (prNumber != null) {
                System.out.println("PR NUMBER: " + prNumber)
            }
        }
    }
}