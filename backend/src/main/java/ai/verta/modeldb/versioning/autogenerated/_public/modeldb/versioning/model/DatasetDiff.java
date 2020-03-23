// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;
import java.util.function.Function;

public class DatasetDiff implements ProtoType {
  private PathDatasetDiff Path;
  private S3DatasetDiff S3;

  public DatasetDiff() {
    this.Path = null;
    this.S3 = null;
  }

  public Boolean isEmpty() {
    if (this.Path != null && !this.Path.equals(null)) {
      return false;
    }
    if (this.S3 != null && !this.S3.equals(null)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\"class\": \"DatasetDiff\", \"fields\": {");
    boolean first = true;
    if (this.Path != null && !this.Path.equals(null)) {
      if (!first) sb.append(", ");
      sb.append("\"Path\": " + Path);
      first = false;
    }
    if (this.S3 != null && !this.S3.equals(null)) {
      if (!first) sb.append(", ");
      sb.append("\"S3\": " + S3);
      first = false;
    }
    sb.append("}}");
    return sb.toString();
  }

  // TODO: actually hash
  public String getSHA() {
    StringBuilder sb = new StringBuilder();
    sb.append("DatasetDiff");
    if (this.Path != null && !this.Path.equals(null)) {
      sb.append("::Path::").append(Path);
    }
    if (this.S3 != null && !this.S3.equals(null)) {
      sb.append("::S3::").append(S3);
    }

    return sb.toString();
  }

  // TODO: not consider order on lists
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof DatasetDiff)) return false;
    DatasetDiff other = (DatasetDiff) o;

    {
      Function3<PathDatasetDiff, PathDatasetDiff, Boolean> f = (x, y) -> x.equals(y);
      if (this.Path != null || other.Path != null) {
        if (this.Path == null && other.Path != null) return false;
        if (this.Path != null && other.Path == null) return false;
        if (!f.apply(this.Path, other.Path)) return false;
      }
    }
    {
      Function3<S3DatasetDiff, S3DatasetDiff, Boolean> f = (x, y) -> x.equals(y);
      if (this.S3 != null || other.S3 != null) {
        if (this.S3 == null && other.S3 != null) return false;
        if (this.S3 != null && other.S3 == null) return false;
        if (!f.apply(this.S3, other.S3)) return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.Path, this.S3);
  }

  public DatasetDiff setPath(PathDatasetDiff value) {
    this.Path = Utils.removeEmpty(value);
    return this;
  }

  public PathDatasetDiff getPath() {
    return this.Path;
  }

  public DatasetDiff setS3(S3DatasetDiff value) {
    this.S3 = Utils.removeEmpty(value);
    return this;
  }

  public S3DatasetDiff getS3() {
    return this.S3;
  }

  public static DatasetDiff fromProto(ai.verta.modeldb.versioning.DatasetDiff blob) {
    if (blob == null) {
      return null;
    }

    DatasetDiff obj = new DatasetDiff();
    {
      Function<ai.verta.modeldb.versioning.DatasetDiff, PathDatasetDiff> f =
          x -> PathDatasetDiff.fromProto(blob.getPath());
      obj.Path = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.DatasetDiff, S3DatasetDiff> f =
          x -> S3DatasetDiff.fromProto(blob.getS3());
      obj.S3 = Utils.removeEmpty(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.DatasetDiff.Builder toProto() {
    ai.verta.modeldb.versioning.DatasetDiff.Builder builder =
        ai.verta.modeldb.versioning.DatasetDiff.newBuilder();
    {
      if (this.Path != null && !this.Path.equals(null)) {
        Function<ai.verta.modeldb.versioning.DatasetDiff.Builder, Void> f =
            x -> {
              builder.setPath(this.Path.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.S3 != null && !this.S3.equals(null)) {
        Function<ai.verta.modeldb.versioning.DatasetDiff.Builder, Void> f =
            x -> {
              builder.setS3(this.S3.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    return builder;
  }

  public void preVisitShallow(Visitor visitor) throws ModelDBException {
    visitor.preVisitDatasetDiff(this);
  }

  public void preVisitDeep(Visitor visitor) throws ModelDBException {
    this.preVisitShallow(visitor);
    visitor.preVisitDeepPathDatasetDiff(this.Path);
    visitor.preVisitDeepS3DatasetDiff(this.S3);
  }

  public DatasetDiff postVisitShallow(Visitor visitor) throws ModelDBException {
    return visitor.postVisitDatasetDiff(this);
  }

  public DatasetDiff postVisitDeep(Visitor visitor) throws ModelDBException {
    this.setPath(visitor.postVisitDeepPathDatasetDiff(this.Path));
    this.setS3(visitor.postVisitDeepS3DatasetDiff(this.S3));
    return this.postVisitShallow(visitor);
  }
}