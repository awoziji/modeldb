// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.swagger._public.modeldb.model

import scala.util.Try

import net.liftweb.json._

import ai.verta.swagger._public.modeldb.model.DatasetTypeEnumDatasetType._
import ai.verta.swagger._public.modeldb.model.DatasetVisibilityEnumDatasetVisibility._
import ai.verta.swagger._public.modeldb.model.OperatorEnumOperator._
import ai.verta.swagger._public.modeldb.model.PathLocationTypeEnumPathLocationType._
import ai.verta.swagger._public.modeldb.model.ValueTypeEnumValueType._
import ai.verta.swagger._public.modeldb.model.ProtobufNullValue._
import ai.verta.swagger.client.objects._

case class ModeldbSetDatasetVersionVisibilty (
  dataset_version_visibility: Option[DatasetVisibilityEnumDatasetVisibility] = None,
  id: Option[String] = None
) extends BaseSwagger {
  def toJson(): JValue = ModeldbSetDatasetVersionVisibilty.toJson(this)
}

object ModeldbSetDatasetVersionVisibilty {
  def toJson(obj: ModeldbSetDatasetVersionVisibilty): JObject = {
    new JObject(
      List[Option[JField]](
        obj.dataset_version_visibility.map(x => JField("dataset_version_visibility", ((x: DatasetVisibilityEnumDatasetVisibility) => DatasetVisibilityEnumDatasetVisibility.toJson(x))(x))),
        obj.id.map(x => JField("id", JString(x)))
      ).flatMap(x => x match {
        case Some(y) => List(y)
        case None => Nil
      })
    )
  }

  def fromJson(value: JValue): ModeldbSetDatasetVersionVisibilty =
    value match {
      case JObject(fields) => {
        val fieldsMap = fields.map(f => (f.name, f.value)).toMap
        ModeldbSetDatasetVersionVisibilty(
          // TODO: handle required
          dataset_version_visibility = fieldsMap.get("dataset_version_visibility").map(DatasetVisibilityEnumDatasetVisibility.fromJson),
          id = fieldsMap.get("id").map(JsonConverter.fromJsonString)
        )
      }
      case _ => throw new IllegalArgumentException(s"unknown type ${value.getClass.toString}")
    }
}
