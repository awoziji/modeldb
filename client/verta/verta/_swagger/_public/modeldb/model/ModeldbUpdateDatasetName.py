# THIS FILE IS AUTO-GENERATED. DO NOT EDIT
from verta._swagger.base_type import BaseType

class ModeldbUpdateDatasetName(BaseType):
  def __init__(self, id=None, name=None):
    required = {
      "id": False,
      "name": False,
    }
    self.id = id
    self.name = name

    for k, v in required.items():
      if self[k] is None and v:
        raise ValueError('attribute {} is required'.format(k))

  @staticmethod
  def from_json(d):
    
    

    tmp = d.get('id', None)
    if tmp is not None:
      d['id'] = tmp
    tmp = d.get('name', None)
    if tmp is not None:
      d['name'] = tmp

    return ModeldbUpdateDatasetName(**d)
