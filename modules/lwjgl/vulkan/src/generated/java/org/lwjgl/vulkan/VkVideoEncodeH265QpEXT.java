/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing H.265 QP values per picture type.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265RateControlLayerInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265QpEXT {
 *     int32_t {@link #qpI};
 *     int32_t {@link #qpP};
 *     int32_t {@link #qpB};
 * }</code></pre>
 */
public class VkVideoEncodeH265QpEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        QPI,
        QPP,
        QPB;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        QPI = layout.offsetof(0);
        QPP = layout.offsetof(1);
        QPB = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkVideoEncodeH265QpEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265QpEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the QP to be used for I-frames. */
    @NativeType("int32_t")
    public int qpI() { return nqpI(address()); }
    /** the QP to be used for P-frames. */
    @NativeType("int32_t")
    public int qpP() { return nqpP(address()); }
    /** the QP to be used for B-frames. */
    @NativeType("int32_t")
    public int qpB() { return nqpB(address()); }

    /** Sets the specified value to the {@link #qpI} field. */
    public VkVideoEncodeH265QpEXT qpI(@NativeType("int32_t") int value) { nqpI(address(), value); return this; }
    /** Sets the specified value to the {@link #qpP} field. */
    public VkVideoEncodeH265QpEXT qpP(@NativeType("int32_t") int value) { nqpP(address(), value); return this; }
    /** Sets the specified value to the {@link #qpB} field. */
    public VkVideoEncodeH265QpEXT qpB(@NativeType("int32_t") int value) { nqpB(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265QpEXT set(
        int qpI,
        int qpP,
        int qpB
    ) {
        qpI(qpI);
        qpP(qpP);
        qpB(qpB);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265QpEXT set(VkVideoEncodeH265QpEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265QpEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265QpEXT malloc() {
        return wrap(VkVideoEncodeH265QpEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265QpEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265QpEXT calloc() {
        return wrap(VkVideoEncodeH265QpEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265QpEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265QpEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH265QpEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265QpEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265QpEXT create(long address) {
        return wrap(VkVideoEncodeH265QpEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265QpEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH265QpEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QpEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QpEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QpEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH265QpEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265QpEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkVideoEncodeH265QpEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265QpEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265QpEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH265QpEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265QpEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265QpEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QpEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QpEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QpEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #qpI}. */
    public static int nqpI(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265QpEXT.QPI); }
    /** Unsafe version of {@link #qpP}. */
    public static int nqpP(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265QpEXT.QPP); }
    /** Unsafe version of {@link #qpB}. */
    public static int nqpB(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265QpEXT.QPB); }

    /** Unsafe version of {@link #qpI(int) qpI}. */
    public static void nqpI(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265QpEXT.QPI, value); }
    /** Unsafe version of {@link #qpP(int) qpP}. */
    public static void nqpP(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265QpEXT.QPP, value); }
    /** Unsafe version of {@link #qpB(int) qpB}. */
    public static void nqpB(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265QpEXT.QPB, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265QpEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265QpEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265QpEXT ELEMENT_FACTORY = VkVideoEncodeH265QpEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265QpEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265QpEXT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkVideoEncodeH265QpEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265QpEXT#qpI} field. */
        @NativeType("int32_t")
        public int qpI() { return VkVideoEncodeH265QpEXT.nqpI(address()); }
        /** @return the value of the {@link VkVideoEncodeH265QpEXT#qpP} field. */
        @NativeType("int32_t")
        public int qpP() { return VkVideoEncodeH265QpEXT.nqpP(address()); }
        /** @return the value of the {@link VkVideoEncodeH265QpEXT#qpB} field. */
        @NativeType("int32_t")
        public int qpB() { return VkVideoEncodeH265QpEXT.nqpB(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265QpEXT#qpI} field. */
        public VkVideoEncodeH265QpEXT.Buffer qpI(@NativeType("int32_t") int value) { VkVideoEncodeH265QpEXT.nqpI(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265QpEXT#qpP} field. */
        public VkVideoEncodeH265QpEXT.Buffer qpP(@NativeType("int32_t") int value) { VkVideoEncodeH265QpEXT.nqpP(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265QpEXT#qpB} field. */
        public VkVideoEncodeH265QpEXT.Buffer qpB(@NativeType("int32_t") int value) { VkVideoEncodeH265QpEXT.nqpB(address(), value); return this; }

    }

}