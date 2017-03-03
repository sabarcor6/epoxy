package com.airbnb.epoxy;

import android.support.annotation.LayoutRes;

import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;

/**
 * Generated file. Do not modify!
 */
public class ModelWithVarargsConstructors_ extends ModelWithVarargsConstructors
    implements GeneratedModel<Object> {

  private OnModelBoundListener<ModelWithVarargsConstructors_, Object>
      onModelBoundListener_epoxyGeneratedModel;
  private OnModelUnboundListener<ModelWithVarargsConstructors_, Object>
      onModelUnboundListener_epoxyGeneratedModel;

  public ModelWithVarargsConstructors(String... varargs) {
    super(varargs);
  }

  public ModelWithVarargsConstructors(int valueInt, String... varargs) {
    super(valueInt, varargs);
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final Object object) {
  }

  @Override
  public void handlePostBind(final EpoxyViewHolder holder, final Object object) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object);
    }
  }

  public ModelWithVarargsConstructors_ onBind(
      OnModelBoundListener<ModelWithVarargsConstructors_, Object> listener) {
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(Object object) {
    super.unbind(object);

    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  public ModelWithVarargsConstructors_ onUnbind(
      OnModelUnboundListener<ModelWithVarargsConstructors_, Object> listener) {
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  public ModelWithVarargsConstructors_ varargs(String[] varargs) {
    this.varargs = varargs;
    return this;
  }

  public String[] varargs() {
    return varargs;
  }

  public ModelWithVarargsConstructors_ valueInt(int valueInt) {
    this.valueInt = valueInt;
    return this;
  }

  public int valueInt() {
    return valueInt;
  }

  @Override
  public ModelWithVarargsConstructors_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public ModelWithVarargsConstructors_ id(CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public ModelWithVarargsConstructors_ id(CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public ModelWithVarargsConstructors_ layout(@LayoutRes int arg0) {
    super.layout(arg0);
    return this;
  }

  @Override
  public ModelWithVarargsConstructors_ show() {
    super.show();
    return this;
  }

  @Override
  public ModelWithVarargsConstructors_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public ModelWithVarargsConstructors_ hide() {
    super.hide();
    return this;
  }

  @Override
  public ModelWithVarargsConstructors_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;

    this.varargs = null;
    this.valueInt = 0;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof ModelWithVarargsConstructors_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    ModelWithVarargsConstructors_ that = (ModelWithVarargsConstructors_) o;
    if ((onModelBoundListener_epoxyGeneratedModel == null) != (
        that.onModelBoundListener_epoxyGeneratedModel == null)) {
      return false;
    }
    if ((onModelUnboundListener_epoxyGeneratedModel == null) != (
        that.onModelUnboundListener_epoxyGeneratedModel == null)) {
      return false;
    }

    if (!Arrays.equals(varargs, that.varargs)) {
      return false;
    }
    if (valueInt != that.valueInt) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);

    result = 31 * result + Arrays.hashCode(varargs);
    result = 31 * result + valueInt;
    return result;
  }

  @Override
  public String toString() {
    return "ModelWithVarargsConstructors_{" +
        "varargs=" + varargs +
        ", valueInt=" + valueInt +
        "}" + super.toString();
  }
}
