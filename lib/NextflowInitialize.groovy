class NextflowInitialize {

    // Validate and initialize workflow properly
    public static void validateParams(workflow, params, log) {

        // Check inputs
        if ( !params.input ) {
            log.error "Please specify an input file with --input <FILE>"
            System.exit(1)
        }

        // Is this a good optional check, idk but it works
        if ( params.sleep ) {
            assert params.sleep instanceof Integer
        }

        // Print Starting Niceness
        log.info """
╔════════════════════════╗
║   ╔═════════════════╗  ║
║   ║  TEST 123 TEST  ║  ║
║   ╚═════════════════╝  ║
╚════════════════════════╝
        """.stripIndent()

        // Track Input Values
        log.info "Params:"
        params.each { key, val ->
            if ( val ) {
                log.info "  $key = $val"
            }
        }

        // Profiles
        log.info "Profile(s): $workflow.profile"
    }
}
