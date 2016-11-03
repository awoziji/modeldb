import sys
import modeldb.sklearn_native.ModelDbSyncer
import modeldb.basic.ModelDbSyncerBase as ModelDbSyncerBase

class SyncerTest(ModelDbSyncerBase.Syncer):
    instance = None
    def __new__(cls, projectConfig, experimentConfig, experimentRunConfig): # __new__ always a classmethod
        # This will break if cls is some random class.
        if not cls.instance:
            cls.instance = object.__new__(cls, projectConfig, experimentConfig, experimentRunConfig)
            ModelDbSyncer.Syncer.instance = cls.instance    
        return cls.instance

    def sync(self):
        events = []
        for b in self.bufferList:
            event = b.makeEvent(self)
            events.append(event)
        return events
    
    def clearBuffer(self):
        self.bufferList = []