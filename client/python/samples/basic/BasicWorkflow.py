from modeldb.basic.ModelDbSyncerBase import *

# Creating a new project
name = "gensim test"
author = "test_user"
description = "using modeldb light logging"
syncer_obj = Syncer(
    NewOrExistingProject(name, author, description),
    DefaultExperiment(),
    NewExperimentRun("Abc"))

print syncer_obj.experiment

print "I'm training some model"

datasets = {
    "train" : Dataset("/path/to/train", {}),
    "test" : Dataset("/path/to/test", {})
}
model ="model_obj"
mdb_model = Model("NN", model, "/path/to/model")
model_config = ModelConfig("NN", {"l1" : 10})
model_metrics = ModelMetrics({"accuracy" : 0.8})

syncer_obj.sync_datasets(datasets)
syncer_obj.sync_model("train", model_config, mdb_model)
syncer_obj.sync_metrics("test", mdb_model, model_metrics)
syncer_obj.sync()

