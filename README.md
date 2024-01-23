# Test Nextflow

## Main
Testing nextflow inputs. Takes an input file and just runs `wc` on it to:
- Save a file with the results
- Print results to stdout

To run:
```bash
nextflow run DarianHole/test-nextflow --input <FILE>
```

## Optional
Add in the `--sleep <INT>` command to sleep the pipeline for `<INT>` seconds

Command:
```bash
nextflow run DarianHole/test-nextflow --input <FILE> --sleep 10
```
